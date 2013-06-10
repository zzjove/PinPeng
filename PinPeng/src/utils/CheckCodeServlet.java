package utils;

//��������֤��
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
	 
	 //randomCode���ڱ��������������֤�룬�Ա��û���¼�������֤��
	 StringBuffer randomCode = new StringBuffer();
	 
	 private static final long serialVersionUID = 1L;
	 
	 //��֤��ͼƬ�Ŀ�ȡ�
	 private int width=60;
	 //��֤��ͼƬ�ĸ߶ȡ�
	 private int height=20;
	 //��֤���ַ�����
	 private int codeCount=4;
	 
	 
	 private int x=0;
	 //����߶�
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
	        //ͼƬ���
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
	 
	            // �����������ɫ
	            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
	            //Color color = new Color(7, 147,77);
	 
	            // �����ɫ����
	            g.setColor(color.darker());
	            g.fillRect(0, 0, width, height);
	           
	            // ��������
	            g.setFont(new Font("arial",Font.BOLD,36));
	           
	            // ��������ַ�,���ݽ�ȡ��λ����������������
	            value = UUID.randomUUID().toString().replace("-","").substring(0,4);
	 
	            int w = (g.getFontMetrics()).stringWidth(value);
	            int d = (g.getFontMetrics()).getDescent();
	            int a = (g.getFontMetrics()).getMaxAscent();
	           
	            int x = 0, y =0;
	           
	            // �����������,15�����ֵԽ��ͼƬ������Խϡ��
	            for (int i = 0; i < height; i += 15)
	            {
	               g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
	               g.drawLine(x, y + i, width, y+i);
	            }
	 
	            // reset x and y
	            x=0;
	            y=0;
	           
	            //�����������,15�����ֵԽ��ͼƬ������Խϡ��
	            for (int i = 0; i < height; i += 15)
	            {
	               g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
	               g.drawLine(x, y + d - i, width + w, height + d - i);
	            }
	           
	            //չʾ��֤������ɫ,���
	            g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)).brighter());
	           
	            // �������ֳ���λ��Ϊ����
	            x = width/2 - w/2;
	            y = height/2 + a/2 - 6;
	           
	            //���ֱ�������
	            AffineTransform fontAT = new AffineTransform();
	            int xp = x-2;
	            // ÿ�����ֶ�����
	            for (int c=0;c<value.length();c++)
	            {
	                // ��������
	                int rotate = rand.nextInt(20);
	                fontAT.rotate(rand.nextBoolean() ? Math.toRadians(rotate) : -Math.toRadians(rotate/2));
	                Font fx = new Font("arial", Font.BOLD, 36).deriveFont(fontAT);
	                g.setFont(fx);
	              //�����������ɫ������������ɫֵ�����������ÿλ���ֵ���ɫֵ������ͬ��
	                Random random = new Random();
	       int red = random.nextInt(255);
	       int green = random.nextInt(255);
	       int blue = random.nextInt(255);
	       
	       //�������������ɫ����֤����Ƶ�ͼ���С�
	       g.setColor(new Color(red, green, blue));
	                String ch = String.valueOf(value.charAt(c));
	                int ht = rand.nextInt(3);
	                // ��ӡ�ֲ��ƶ�λ��
	                g.drawString(ch, xp, y + (rand.nextBoolean()?-ht:ht));
	                //�ƶ�ָ��.
	                xp+=g.getFontMetrics().stringWidth(ch) + 2;
	            }
	            // ��ӡ��ͼƬ
	            ImageIO.write(bimage, "png", out);
	            //���ý���ǰ�Ự
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
	                    // �ر�OutputStream
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