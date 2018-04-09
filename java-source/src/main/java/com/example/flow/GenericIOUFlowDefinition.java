package com.example.flow;

import kotlin.Unit;
import net.corda.core.flows.FlowLogic;
import net.corda.core.flows.InitiatingFlow;
import net.corda.core.flows.StartableByRPC;

@StartableByRPC
@InitiatingFlow
public abstract class GenericIOUFlowDefinition extends FlowLogic<Unit> {
}
