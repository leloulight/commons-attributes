/*
 * Copyright 2003-2004 The Apache Software Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.attributes.test;

import junit.framework.TestCase;

import org.apache.commons.attributes.Attributes;
import org.apache.commons.attributes.InvalidAttributeTargetError;

public class TargetTestCase extends TestCase {
    
    public void testMethodAttributeOnClass () throws Exception {
        Class clazz1 = ClassWithInvalidDeclarations.class;
        
        try {
            Attributes.getAttributes (clazz1);
            
            fail ();
        } catch (InvalidAttributeTargetError iate) {
            System.out.println (iate.getMessage ());
            // OK.
        }
    }
}