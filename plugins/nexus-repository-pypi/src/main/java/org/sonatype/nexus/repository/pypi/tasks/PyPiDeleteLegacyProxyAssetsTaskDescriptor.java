/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.pypi.tasks;

import javax.inject.Named;
import javax.inject.Singleton;

import org.sonatype.nexus.scheduling.TaskDescriptorSupport;

/**
 * Task descriptor for {@link PyPiDeleteLegacyProxyAssetsTask}.
 *
 * @since 3.next
 */
@Named
@Singleton
public class PyPiDeleteLegacyProxyAssetsTaskDescriptor
    extends TaskDescriptorSupport
{
  public static final String TASK_NAME = "PyPi - Delete legacy proxy assets";

  public static final String TYPE_ID = "repository.pypi.delete-legacy-proxy-assets";

  public PyPiDeleteLegacyProxyAssetsTaskDescriptor() {
    super(TYPE_ID, PyPiDeleteLegacyProxyAssetsTask.class, TASK_NAME, VISIBLE, EXPOSED);
  }
}
