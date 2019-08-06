package com.google.api.graphql.examples.library.graphqlserver.client;

import com.google.inject.AbstractModule;
/**
 * 这个其实是将2个服务端安装在同一块
 */

/** Installs all of the client modules. */
public final class ClientModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new BookClientModule());
        install(new ShelfClientModule());
    }
}
