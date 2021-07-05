/*
 * checksum-maven-plugin - http://checksum-maven-plugin.nicoulaj.net
 * Copyright © 2010-2021 checksum-maven-plugin contributors
 *
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
 */
package net.nicoulaj.maven.plugins.checksum.digest;

/**
 * Base class for implementations of {@link net.nicoulaj.maven.plugins.checksum.digest.FileDigester}.
 *
 * @author <a href="mailto:julien.nicoulaud@gmail.com">Julien Nicoulaud</a>
 * @since 1.0
 * @version $Id: $Id
 */
public abstract class AbstractFileDigester
    implements FileDigester
{
    /**
     * The algorithm used to compute checksum digests.
     */
    protected final String algorithm;

    /**
     * Build a new instance of {@link net.nicoulaj.maven.plugins.checksum.digest.AbstractFileDigester}.
     *
     * @param algorithm the algorithm used to compute checksum digests.
     */
    protected AbstractFileDigester( String algorithm )
    {
        this.algorithm = algorithm;
    }

    /**
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object
     */
    public String getAlgorithm()
    {
        return algorithm;
    }

    /**
     * {@inheritDoc}
     *
     * @return a {@link java.lang.String} object
     */
    public String getFileExtension()
    {
        return "." + algorithm.toLowerCase().replaceAll( "[\\W]", "" );
    }
}
