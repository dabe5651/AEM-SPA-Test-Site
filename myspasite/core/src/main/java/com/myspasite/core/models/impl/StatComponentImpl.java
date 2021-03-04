package com.myspasite.core.models.impl;

import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import com.myspasite.core.models.StatComponent;

@Model(adaptables = SlingHttpServletRequest.class, 
        adapters = { StatComponent.class, ComponentExporter.class }, 
        resourceType = StatComponentImpl.RESOURCE_TYPE, 
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class StatComponentImpl implements StatComponent {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String subtitle;

    static final String RESOURCE_TYPE = "myspasite/components/stat";

    @Override
    public String getTitle() {
        return StringUtils.isNotBlank(title) ? title.toUpperCase() : null;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public String getExportedType() {
        return StatComponentImpl.RESOURCE_TYPE;
    }

}