/**
 * Copyright (C) 2019 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.expediagroup.library.drshadow.springboot;

/**
 * Helper class to retrieve the shadow traffic configuration. V1 is based off yaml file configuration.
 *
 * TODO: make this pluggable for various dynamic use cases. The value in Dr Shadow is more on the runtime dynamic configuration.
 */
public class ShadowTrafficConfigHelper {

    private ShadowTrafficConfig shadowTrafficConfig;

    /**
     *
     * @param shadowTrafficConfig Shadow Traffic Configuration
     */
    public ShadowTrafficConfigHelper(ShadowTrafficConfig shadowTrafficConfig) {
        this.shadowTrafficConfig = shadowTrafficConfig;
    }
    
    /**
     * Get the Shadow Traffic Configuration.
     * 
     * @return shadowTrafficConfig
     */
    public ShadowTrafficConfig getConfig() {
        return shadowTrafficConfig;
    }
    
}
