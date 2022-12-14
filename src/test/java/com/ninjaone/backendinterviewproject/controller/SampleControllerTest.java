package com.ninjaone.backendinterviewproject.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninjaone.backendinterviewproject.BackendInterviewProjectApplication;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { BackendInterviewProjectApplication.class })
//@WebMvcTest(SampleController.class)
@AutoConfigureMockMvc
@AutoConfigureDataJpa
public class SampleControllerTest {
	public static final String ID = "12345";

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	/*
	 * @MockBean private SampleService sampleService;
	 * 
	 * private Sample sampleEntity;
	 * 
	 * @BeforeEach void setup(){ sampleEntity = new Sample(ID, "value"); }
	 * 
	 * @Test void getSampleData() throws Exception {
	 * when(sampleService.getSampleEntity(ID)).thenReturn(Optional.of(sampleEntity))
	 * ;
	 * 
	 * mockMvc.perform(get("/sample/" + ID)) .andExpect(status().isOk())
	 * .andExpect(content().contentType(MediaType.APPLICATION_JSON))
	 * .andExpect(content().string(objectMapper.writeValueAsString(sampleEntity)));
	 * }
	 * 
	 * @Test void postSampleData() throws Exception {
	 * when(sampleService.saveSampleEntity(any())).thenReturn(sampleEntity);
	 * 
	 * String sampleEntityString = objectMapper.writeValueAsString(sampleEntity);
	 * mockMvc.perform(post("/sample") .contentType(MediaType.APPLICATION_JSON)
	 * .content(sampleEntityString)) .andExpect(status().isCreated())
	 * .andExpect(content().string(sampleEntityString)); }
	 * 
	 * @Test void deleteSampleData() throws Exception {
	 * doNothing().when(sampleService).deleteSampleEntity(ID);
	 * 
	 * mockMvc.perform(delete("/sample/" + ID)) .andExpect(status().isNoContent());
	 * }
	 */
}
