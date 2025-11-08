package org.yaml.snakeyaml.parser;

import org.yaml.snakeyaml.events.Event;

public interface Parser {
  boolean checkEvent(Event.ID paramID);
  
  Event peekEvent();
  
  Event getEvent();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/yaml/snakeyaml/parser/Parser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */