/**
 * 
 */
package org.atmosphere.samples.server.services;

import java.util.List;

import org.atmosphere.samples.client.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author belo82
 * 
 */
@Component("dummyService")
public class DummyService {
    private static final Logger logger = LoggerFactory.getLogger(DummyService.class);

    public void logMessage(List<Event> messages) {
        if (messages.size() > 0) {
            logger.debug(messages.get(0).getMessage());
            System.out.println(messages.get(0).getMessage());
        } else {
            logger.debug("NO MESSAGE");
            System.out.println("NO MESSAGE");
        }
    }
}
