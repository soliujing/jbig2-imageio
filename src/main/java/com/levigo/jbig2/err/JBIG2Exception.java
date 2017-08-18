/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.levigo.jbig2.err;

/**
 * Identifies a JBIG2 exception.
 */
public class JBIG2Exception extends Exception {

  private static final long serialVersionUID = 5063673874564442169L;

  public JBIG2Exception() {
  }

  public JBIG2Exception(String message) {
    super(message);
  }

  public JBIG2Exception(Throwable cause) {
    super(cause);
  }

  public JBIG2Exception(String message, Throwable cause) {
    super(message, cause);
  }

}
