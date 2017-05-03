package org.apache.deltaspike.example.scope;

import org.apache.deltaspike.core.api.scope.GroupedConversationScoped;

import javax.annotation.PostConstruct;
import javax.inject.Named;

/**
 * Created by rkelapure on 5/1/17.
 */

@GroupedConversationScoped
@Named
public class GroupedScopedConversationBean  extends ScopedBean {

    @PostConstruct
    public void init()
    {
        super.init();
    }


}
