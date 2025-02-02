/*
 * Copyright 2023 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.kogito.index.postgresql.model;

import java.io.Serializable;
import java.util.Objects;

public class NodeEntityId implements Serializable {

    private String id;

    private ProcessDefinitionEntity processDefinition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProcessDefinitionEntity getProcessDefinition() {
        return processDefinition;
    }

    public void setProcessDefinition(ProcessDefinitionEntity processDefinition) {
        this.processDefinition = processDefinition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        NodeEntityId that = (NodeEntityId) o;
        return Objects.equals(id, that.id) && Objects.equals(processDefinition, that.processDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, processDefinition);
    }

    @Override
    public String toString() {
        return "NodeEntityId{" +
                "id='" + id + '\'' +
                ", processDefinition='" + processDefinition + '\'' +
                '}';
    }
}
