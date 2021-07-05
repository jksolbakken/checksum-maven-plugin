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
package net.nicoulaj.maven.plugins.checksum.artifacts;

import java.io.File;

/**
 * <p>ArtifactListener interface.</p>
 *
 * @author nicoulaj
 * @version $Id: $Id
 */
public interface ArtifactListener {
    /**
     * <p>artifactCreated.</p>
     *
     * @param artifact a {@link java.io.File} object
     * @param checksumType a {@link java.lang.String} object
     * @param artifactExtension a {@link java.lang.String} object
     * @param artifactClassifier a {@link java.lang.String} object
     */
    void artifactCreated(File artifact, String checksumType, String artifactExtension, String artifactClassifier);
}
