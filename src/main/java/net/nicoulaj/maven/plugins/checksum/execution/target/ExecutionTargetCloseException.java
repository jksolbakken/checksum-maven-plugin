/*-
 * ====================================================================
 * checksum-maven-plugin
 * ====================================================================
 * Copyright (C) 2010 - 2016 Julien Nicoulaud <julien.nicoulaud@gmail.com>
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package net.nicoulaj.maven.plugins.checksum.execution.target;

/**
 * Thrown when an error occurs while trying to close an {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTarget}.
 *
 * @author <a href="mailto:julien.nicoulaud@gmail.com">Julien Nicoulaud</a>
 * @see ExecutionTarget#close(String)
 * @since 1.0
 * @version $Id: $Id
 */
public class ExecutionTargetCloseException
    extends Exception
{
    /**
     * Build a new instance of {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetCloseException}.
     *
     * @param message the message describing the error.
     */
    public ExecutionTargetCloseException( String message )
    {
        super( message );
    }
    /**
     * Build a new instance of {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetCloseException}.
     *
     * @param message the message describing the error.
     * @param cause the cause exception.
     */
    public ExecutionTargetCloseException( String message , Throwable cause)
    {
        super( message, cause );
    }
}
