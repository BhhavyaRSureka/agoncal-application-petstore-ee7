// Test generated by RoostGPT for test JavyaUnitTesting using AI Type Open AI and AI Model gpt-4

package org.agoncal.application.petstore.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AbstractBean_getParam_af741b4b12_Test {

    private AbstractBean abstractBean;
    private FacesContext facesContext;
    private ExternalContext externalContext;
    private Map<String, String> requestParameters;

    @BeforeEach
    public void setup() {
        abstractBean = new AbstractBean();
        facesContext = mock(FacesContext.class);
        externalContext = mock(ExternalContext.class);
        requestParameters = new HashMap<>();

        when(facesContext.getExternalContext()).thenReturn(externalContext);
        when(externalContext.getRequestParameterMap()).thenReturn(requestParameters);

        FacesContext.setCurrentInstance(facesContext);
    }

    @Test
    public void testGetParam() {
        String param = "testParam";
        String value = "testValue";
        requestParameters.put(param, value);

        String result = abstractBean.getParam(param);

        assertEquals(value, result);
    }

    @Test
    public void testGetParamNonExistent() {
        String param = "nonExistentParam";

        String result = abstractBean.getParam(param);

        assertEquals(null, result);
    }
}
