/**
 * 
 */
package org.atmosphere.samples.server.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author belo82
 * 
 */
public class ApplicationContextProvider implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationContextProvider.class);
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static Object getBean(String name) {
        try {
            return applicationContext.getBean(name);
        } catch (Throwable th) {
            logger.error("Could not create bean " + name, th);
            return null;
        }
    }

}
