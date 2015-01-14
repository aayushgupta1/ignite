/*
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

package org.gridgain.grid.kernal.ggfs.common;

import java.io.*;

/**
 * Data input stream implementing object input but throwing exceptions on object methods.
 */
public class GridGgfsDataInputStream extends DataInputStream implements ObjectInput {
    /**
     * Creates a DataInputStream that uses the specified
     * underlying InputStream.
     *
     * @param  in The specified input stream
     */
    public GridGgfsDataInputStream(InputStream in) {
        super(in);
    }

    /** {@inheritDoc} */
    @Override public Object readObject() throws ClassNotFoundException, IOException {
        throw new IOException("This method must not be invoked on GGFS data input stream.");
    }
}
