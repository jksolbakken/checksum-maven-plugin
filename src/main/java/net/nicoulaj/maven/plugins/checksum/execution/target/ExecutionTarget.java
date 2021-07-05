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

/**
 * An {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTarget} is an output target for calculated digests.
 *
 * @author <a href="mailto:julien.nicoulaud@gmail.com">Julien Nicoulaud</a>
 * @since 1.0
 * @version $Id: $Id
 */
public interface ExecutionTarget
{
    /**
     * Initialize the target.
     *
     * <p>Should be called before first call to {@link #write(String, ChecksumFile, String)}.</p>
     *
     * @throws net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetInitializationException
     *          if an error occured while initializing the target.
     */
    void init()
        throws ExecutionTargetInitializationException;

    /**
     * Write the hashcode calculated for the given file and algorithm to the target.
     *
     * @param digest    the digest to write.
     * @param file      the file for which the digest was calculated.
     * @param algorithm the algorithm used to calculate the digest.
     * @throws net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetWriteException if an error occured while writing to the target.
     */
    void write( String digest, ChecksumFile file, String algorithm )
        throws ExecutionTargetWriteException;

    /**
     * Close the target.
     *
     * <p>Should be called after last call to {@link #write(String, ChecksumFile, String)}.</p>
     *
     * @param subPath part of relative path to exclude from file path
     * @throws net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetCloseException if an error occured while closing the target.
     */
    void close(String subPath)
        throws ExecutionTargetCloseException;
}
