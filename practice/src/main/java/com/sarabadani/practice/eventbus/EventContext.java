package com.sarabadani.practice.eventbus;

import java.util.Objects;

/**
 * Created by soroosh on 12/2/14.
 */
public interface EventContext<T extends Event> {
    T getEvent();

    Objects getSource();
}
