package com.vhots.dropwizard;

import com.vhots.dropwizard.config.DropwizardJavaSimpleConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<DropwizardJavaSimpleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardJavaSimple";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardJavaSimpleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardJavaSimpleConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
