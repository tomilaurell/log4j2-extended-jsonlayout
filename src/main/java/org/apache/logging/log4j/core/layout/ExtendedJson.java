package org.apache.logging.log4j.core.layout;

import org.apache.logging.log4j.core.LogEvent;

import java.util.Map;

public interface ExtendedJson {

    Map<String, Object> getMixedFields(LogEvent logEvent);

}
