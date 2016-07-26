/*
 * Copyright 2011,2012 Metamarkets Group Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.metamx.common.config;

import org.skife.config.ConfigurationObjectFactory;

import java.util.Properties;

/**
*/
public class Config
{
  public static ConfigurationObjectFactory createFactory(Properties props)
  {
    ConfigurationObjectFactory configFactory = new ConfigurationObjectFactory(props);
    configFactory.addCoercible(new DurationCoercible());
    return configFactory;
  }
}