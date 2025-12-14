package org.jvnet.hudson.test;

/**
 * Interface used as a Category for classifying a test as a smoke-test.
 *
 * <p>
 * All tests annotated like {@code @Category(SmokeTest.class)} would be run in the {@code smoke-test} suite.
 * The {@code smoke-test} suite is meant for running unit tests and a number of functional tests.
 * </p>
 *
 * @see <a href="https://github.com/junit-team/junit4/wiki/categories">https://github.com/junit-team/junit4/wiki/categories</a>
 * @since TODO
 */
public interface SmokeTest {}
