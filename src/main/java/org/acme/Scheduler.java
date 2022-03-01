package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class Scheduler {

    @RestClient
    ReactiveClient client;

    @Inject
    Logger log;

    @Scheduled(every = "1s")
    void scheduledMethod() {
        String resp = client.testApi();
        log.infof("resp is %s", resp);
    }

}
