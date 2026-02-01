package dslabs.clientserver;

import dslabs.framework.Message;

// additional imports by me
import dslabs.framework.Command;
import dslabs.framework.Result;

import lombok.Data;

@Data
class Request implements Message { // struct Request { command: Command, sequenceNum: i32 }
  // Your code here...
  private final Command command;
  private final int sequenceNum;
}

@Data
class Reply implements Message { // struct Reply { result: Result, sequenceNum: i32 }
  // Your code here...
  private final Result result;
  private final int sequenceNum;
}
