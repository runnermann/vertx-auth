/*
 * Copyright (c) 2011-2024 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */
open module io.vertx.tests {
  requires io.vertx.auth.common;
  requires io.vertx.auth.webauthn4j;
  requires io.vertx.testing.unit;
  requires junit;
  requires com.webauthn4j.metadata.async;
  requires com.webauthn4j.test;
  requires io.vertx.core;
}
