/*
 * Copyright (c) 2021 TeodorHMX1 (Teodor G.)
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package org.teogor.modernnetwork.tcp;

@SuppressWarnings("UnusedReturnValue")
public class TCP
{

    private int port = 7000;
    private String host = "localhost";

    public static TCP Builder()
    {
        return new TCP();
    }

    public TCP port(int port)
    {
        this.port = port;
        return this;
    }

    public TCP host(String host)
    {
        this.host = host;
        return this;
    }

    public TCPServer createServer()
    {
        return new TCPServer(host, port);
    }

    public TCPClient joinServer()
    {
        return new TCPClient(host, port);
    }

}
