package com.sarabadani.practice;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by soroosh on 11/29/14.
 */
public class RetryCommand {
    public static class Builder {

        private Runnable runnable;
        private final Set<Class<? extends Throwable>> retries;
        private final Set<Class<? extends Throwable>> excepts;
        private int count = 2;

        public Builder() {
            this.retries = new HashSet();
            this.excepts = new HashSet();
        }

        public Builder run(Runnable runnable) {
            this.runnable = runnable;
            return this;
        }

        public Builder retryOn(Class<? extends Throwable> exception) {
            this.retries.add(exception);
            return this;
        }

        public Builder except(Class<? extends Throwable> exception) {
            this.excepts.add(exception);
            return this;

        }

        public Builder retryFor(int count) {
            if (count < 2) {
                throw new IllegalArgumentException("Count should be greater than 1");
            }
            this.count = count;
            return this;
        }

        public RetryCommand build() {
            return new RetryCommand();
        }

    }

    private RetryCommand() {

    }

}
