package main.java;/** * class for matrix positions */import java.lang.*;  // for class Exceptionpublic class InvalidOpExcep extends RuntimeException {            /**         * Constructs a <code>InvalidOperationException</code>          * with no detail message.         */        public InvalidOpExcep() {                super();        }        /**         * Constructs a <code>DimensionException</code> with the specified          * detail message.          *         * @param   s   the detail message.         */        public InvalidOpExcep(String message) {                super( message );        }}