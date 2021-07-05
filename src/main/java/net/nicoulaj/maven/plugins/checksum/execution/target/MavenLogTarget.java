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

import net.nicoulaj.maven.plugins.checksum.mojo.ChecksumFile;
import org.apache.maven.plugin.logging.Log;


/**
 * An {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTarget} that writes digests to a Maven {@link org.apache.maven.plugin.logging.Log}.
 *
 * @author <a href="mailto:julien.nicoulaud@gmail.com">Julien Nicoulaud</a>
 * @see org.apache.maven.plugin.logging.Log
 * @since 1.0
 * @version $Id: $Id
 */
public class MavenLogTarget
    implements ExecutionTarget
{
    /**
     * The Maven {@link org.apache.maven.plugin.logging.Log}.
     */
    protected Log logger;

    /**
     * Build an new instance of {@link net.nicoulaj.maven.plugins.checksum.execution.target.MavenLogTarget}.
     *
     * @param logger the Maven {@link org.apache.maven.plugin.logging.Log} to use.
     */
    public MavenLogTarget( Log logger )
    {
        this.logger = logger;
    }

    /**
     * {@inheritDoc}
     */
    public void init()
    {
        // Nothing to do
    }

    /** {@inheritDoc} */
    public void write( String digest, ChecksumFile file, String algorithm )
    {
        logger.info( file.getFile().getName() + " - " + algorithm + " : " + digest );
    }

    /** {@inheritDoc} */
    public void close( String subPath)
    {
        // Nothing to do
    }
}
