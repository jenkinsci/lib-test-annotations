package org.jvnet.hudson.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a test case to a bug filed in the issue tracker.
 *
 * @author Kohsuke Kawaguchi
 */
@Documented
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Issue {
    /**
     * Issue ID, such as JENKINS-12345 or SECURITY-34.
     */
    String value();
}
