package utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtils {
	// ��request���ݷ�װ��bean��
	public static <T> T requestToBean(HttpServletRequest request,
			Class<T> beanClass) {

		try {
			// ����Ҫ��װ���ݵ�bean
			T bean = beanClass.newInstance();

			// ��request�е����ݷ�װ��bean��
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
