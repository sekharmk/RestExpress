package com.kickstart.serialization;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.strategicgains.restexpress.serialization.jackson.JacksonJsonProcessor;

/**
 * @author toddf
 * @since Oct 10, 2011
 */
public class JsonSerializationProcessor
extends JacksonJsonProcessor
{

//	public JsonSerializationProcessor()
//    {
//	    super(
//	    	new GsonBuilder()
//			.disableHtmlEscaping()
//			.registerTypeAdapter(Date.class, new GsonTimestampSerializer())
////			.registerTypeAdapter(ObjectId.class, new GsonObjectIdSerializer())
//			.setDateFormat(DateAdapterConstants.TIMESTAMP_OUTPUT_FORMAT)
//			.create()
//	    );
//    }
	
	public JsonSerializationProcessor()
	{
		super(new ObjectMapper()
			.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false)
			.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false)
			.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL)
		);
	}
}
