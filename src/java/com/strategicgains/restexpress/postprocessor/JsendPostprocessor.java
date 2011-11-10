/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.restexpress.postprocessor;

import com.strategicgains.restexpress.Format;
import com.strategicgains.restexpress.Request;
import com.strategicgains.restexpress.Response;
import com.strategicgains.restexpress.pipeline.Postprocessor;

/**
 * @author toddf
 * @since Nov 9, 2011
 */
public class JsendPostprocessor
implements Postprocessor
{
	@Override
	public void process(Request request, Response response)
	{
		if (request.isFormatEqual(Format.JSEND))
		{
			
		}
	}

	@Override
	public boolean equals(Object obj)
	{
		return (obj.getClass().equals(this.getClass()));
	}
}
