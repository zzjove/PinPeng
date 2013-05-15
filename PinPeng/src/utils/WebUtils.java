package utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtils {
	// 将request数据封装到bean中
	public static <T> T requestToBean(HttpServletRequest request,
			Class<T> beanClass) {

		try {
			// 创建要封装数据的bean
			T bean = beanClass.newInstance();

			// 把request中的数据封装到bean中
			Enumeration e = request.getParameterNames();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String value = request.getParameter(name);
				BeanUtils.setProperty(bean, name, value);
			}
			return bean;
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

}
