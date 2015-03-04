/**
 *
 * Copyright 2014 sourceforge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtopenmaps.openlayers.client.format.GML.GML;

import org.gwtopenmaps.openlayers.client.format.GML.VectorFormat;
import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * GML parser and writer, supports simple features profile ONLY. Wraps
 * OpenLayers.Format.GML
 *
 * @author Mikael Couzic
 */
public class GML extends VectorFormat {

    protected GML(JSObject gmlFormat) {
        super(gmlFormat);
    }

    public GML() {
        this(GMLImpl.create());
    }

}