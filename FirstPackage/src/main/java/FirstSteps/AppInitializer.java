package FirstSteps;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
 
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//klasa nadrzêdna konfiguracji
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	//klasa konfiguracji
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebConfig.class};
	}
	//
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
