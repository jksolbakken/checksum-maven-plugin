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

package net.nicoulaj.maven.plugins.checksum.test.unit.execution.target;

import net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTarget;
import net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetWriteException;
import net.nicoulaj.maven.plugins.checksum.execution.target.MavenLogTarget;
import net.nicoulaj.maven.plugins.checksum.mojo.ChecksumFile;
import org.apache.maven.plugin.logging.SystemStreamLog;
import org.junit.Test;

import java.io.File;

/**
 * Tests for the {@link net.nicoulaj.maven.plugins.checksum.execution.target.MavenLogTarget}
 * {@link net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTarget}.
 *
 * @author <a href="mailto:julien.nicoulaud@gmail.com">Julien Nicoulaud</a>
 * @version $Id: $Id
 * @since 1.11
 */
public class MavenLogTargetTest
{
    /**
     * The instance of {@link net.nicoulaj.maven.plugins.checksum.execution.target.MavenLogTarget} used for the test.
     */
    ExecutionTarget target = new MavenLogTarget( new SystemStreamLog() );

    /**
     * Assert wrting to the target does not throw exceptions.
     *
     * @throws net.nicoulaj.maven.plugins.checksum.execution.target.ExecutionTargetWriteException should never happen.
     * @see net.nicoulaj.maven.plugins.checksum.execution.target.MavenLogTarget#write(String, ChecksumFile, String)
     */
    @Test
    public void testMavenLogTargetWrite()
        throws ExecutionTargetWriteException
    {
        target.write( "hash", new ChecksumFile( "", new File( "target/test-classes/test-file" ), null, null ), "MD5" );
    }
}
