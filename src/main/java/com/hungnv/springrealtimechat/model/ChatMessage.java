package com.hungnv.springrealtimechat.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    long id;
    String sender;
    String content;
}
