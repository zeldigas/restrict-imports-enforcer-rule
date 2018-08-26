package de.skuzzle.enforcer.restrictimports;

import org.apache.maven.enforcer.rule.api.EnforcerRuleException;
import org.apache.maven.enforcer.rule.api.EnforcerRuleHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enforcer rule which restricts the usage of certain packages or classes within a Java
 * code base.
 *
 * @deprecated Use {@link de.skuzzle.enforcer.restrictimports.rule.RestrictImports}
 *             instead.
 * @author Simon Taddiken
 */
@Deprecated
public class RestrictImports
        extends de.skuzzle.enforcer.restrictimports.rule.RestrictImports {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestrictImports.class);

    @Override
    public void execute(EnforcerRuleHelper helper) throws EnforcerRuleException {
        LOGGER.warn("");
        LOGGER.warn("Deprecation warning (since 0.12.0):");
        LOGGER.warn(
                "You are using the deprecated RestrictImports rule from '{}'. Please use the class '{}' instead",
                this.getClass().getName(),
                de.skuzzle.enforcer.restrictimports.rule.RestrictImports.class.getName());
        LOGGER.warn(
                "Future versions might break the build instead of just showing this warning!");
        LOGGER.warn("");
        super.execute(helper);
    }

}