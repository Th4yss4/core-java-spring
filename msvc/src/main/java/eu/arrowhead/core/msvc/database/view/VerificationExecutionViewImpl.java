package eu.arrowhead.core.msvc.database.view;

import eu.arrowhead.core.msvc.database.VerificationRunResult;
import eu.arrowhead.core.msvc.database.entities.VerificationExecution;
import org.springframework.util.Assert;

import java.time.ZonedDateTime;

public class VerificationExecutionViewImpl implements VerificationExecutionView {

    private final VerificationExecution target;

    public VerificationExecutionViewImpl(final VerificationExecution target) {
        Assert.notNull(target, "Backing execution is null");
        Assert.notNull(target.getVerificationList(),"Backing verificationList is null");
        this.target = target;
    }

    @Override
    public Long getId() {
        return target.getId();
    }

    @Override
    public TargetView getTarget() {
        return new TargetViewImpl(target.getTarget());
    }

    @Override
    public VerificationListView getVerificationList() {
        return new VerificationListViewImpl(target.getVerificationList());
    }

    @Override
    public ZonedDateTime getExecutionDate() {
        return target.getExecutionDate();
    }

    @Override
    public VerificationRunResult getResult() {
        return target.getResult();
    }

    @Override
    public String toString() {
        return target.toString();
    }
}
