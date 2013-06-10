package utils;

//输出随机验证码
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.UUID;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class CheckCodeServlet{
	 HttpServletRequest request = ServletActionContext.getRequest();
	 HttpServletResponse response = ServletActionContext.getResponse();
	 HttpSession session = request.getSession();
	 
	 //randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
	 StringBuffer randomCode = new StringBuffer();
	 
	 private static final long serialVersionUID = 1L;
	 
	 //验证码图片的宽度。
	 private int width=60;
	 //验证码图片的高度。
	 private int height=20;
	 //验证码字符个数
	 private int codeCount=4;
	 
	 
	 private int x=0;
	 //字体高度
	 private int fontHeight;
	 private int codeY;
	 
	 char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
	 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
	 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	 
	 
	 public String execute() throws Exception {
	  
	  response.setHeader("Pragma", "No-cache");
	        response.setHeader("Cache-Control", "no-cache");
	        response.setDateHeader("Expires", 0);
	        response.setHeader("Content-Type", "image/jpeg");
	        //图片宽高
	        int width = 95;
	        int height = 30;
	        BufferedImage bimage = null;
	        Graphics2D g = null;
	        HttpSession session = request.getSession();
	        OutputStream out = null;
	        String value;
	        try
	        {
	            out = response.getOutputStream();
	 
	            bimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);       
	            Random rand=new Random(System.currentTimeMillis());
	            g = bimage.createGraphics();
	 
	            // 设置随机背景色
	            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
	            //Color color = new Color(7, 147,77);
	 
	            // 填充深色背景
	            g.setColor(color.darker());
	            g.fillRect(0, 0, width, height);
	           
	            // 设置字体
	            g.setFont(new Font("arial",Font.BOLD,36));
	           
	            // 随机生成字符,根据截取的位数决定产生的数字
	            value = UUID.randomUUID().toString().replace("-","").substring(0,4);
	 
	            int w = (g.getFontMetrics()).stringWidth(value);
	            int d = (g.getFontMetrics()).getDescent();
	            int a = (g.getFontMetrics()).getMaxAscent();
	           
	            int x = 0, y =0;
	           
	            // 设置随机线条,15这个数值越大图片中线条越稀蔬
	            for (int i = 0; i < height; i += 15)
	            {
	               g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
	               g.drawLine(x, y + i, width, y+i);
	            }
	 
	            // reset x and y
	            x=0;
	            y=0;
	           
	            //设置随机线条,15这个数值越大图片中线条越稀蔬
	            for (int i = 0; i < height; i += 15)
	            {
	               g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
	               g.drawLine(x, y + d - i, width + w, height + d - i);
	            }
	           
	            //展示验证码中颜色,随机
	            g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)).brighter());
	           
	            // 设置文字出现位置为中央
	            x = width/2 - w/2;
	            y = height/2 + a/2 - 6;
	           
	            //文字变形设置
	            AffineTransform fontAT = new AffineTransform();
	            int xp = x-2;
	            // 每个文字都变形
	            for (int c=0;c<value.length();c++)
	            {
	                // 产生弧度
	                int rotate = rand.nextInt(20);
	                fontAT.rotate(rand.nextBoolean() ? Math.toRadians(rotate) : -Math.toRadians(rotate/2));
	                Font fx = new Font("arial", Font.BOLD, 36).deriveFont(fontAT);
	                g.setFont(fx);
	              //产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
	                Random random = new Random();
	       int red = random.nextInt(255);
	       int green = random.nextInt(255);
	       int blue = random.nextInt(255);
	       
	       //用随机产生的颜色将验证码绘制到图像中。
	       g.setColor(new Color(red, green, blue));
	                String ch = String.valueOf(value.charAt(c));
	                int ht = rand.nextInt(3);
	                // 打印字并移动位置
	                g.drawString(ch, xp, y + (rand.nextBoolean()?-ht:ht));
	                //移动指针.
	                xp+=g.getFontMetrics().stringWidth(ch) + 2;
	            }
	            // 打印出图片
	            ImageIO.write(bimage, "png", out);
	            //设置进当前会话
	            session.setAttribute("randomNum", value);
	 
	        }
	        catch (IOException ex){
	            ex.printStackTrace();
	        }
	        finally{
	            if (g != null){
	                g.dispose();
	            }
	            if (out != null){
	                try{
	                    // 关闭OutputStream
	                    out.close();
	                }
	                catch (IOException ex){
	                    ex.printStackTrace();
	                }
	            }
	        }
	        return null;
	}
}