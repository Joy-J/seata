/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.integration.tx.api.interceptor.parser;

import io.seata.integration.tx.api.interceptor.handler.ProxyInvocationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author leezongjie
 */
class GlobalTransactionalInterceptorParserTest {

    @Test
    void parserInterfaceToProxy() throws Exception {

        //given
        BusinessImpl business = new BusinessImpl();

        GlobalTransactionalInterceptorParser globalTransactionalInterceptorParser = new GlobalTransactionalInterceptorParser();

        //when
        ProxyInvocationHandler proxyInvocationHandler = globalTransactionalInterceptorParser.parserInterfaceToProxy(business, business.getClass().getName());

        //then
        Assertions.assertNotNull(proxyInvocationHandler);


    }
}