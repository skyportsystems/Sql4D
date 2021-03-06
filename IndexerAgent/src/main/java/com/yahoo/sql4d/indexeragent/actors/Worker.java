/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
package com.yahoo.sql4d.indexeragent.actors;

import akka.actor.UntypedActor;
import com.yahoo.sql4d.indexeragent.work.Work;

/**
 *
 * @author srikalyan
 */
public class Worker extends UntypedActor {

    public Worker() {
    }

    @Override
    public void onReceive(Object o) throws Exception {
        if (o instanceof Work) {
            System.out.println(hashCode() + " received some work " + o);
        } else {
            throw new UnsupportedOperationException("Worker received unknown message ." + o);
        }
        
    }

}
