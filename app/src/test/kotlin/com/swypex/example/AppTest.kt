package com.swypex.example

import io.temporal.testing.TestWorkflowEnvironment
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.ActiveProfiles

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ActiveProfiles("test")
@DirtiesContext
class AppTest {

    @Autowired lateinit var testWorkflowEnvironment: TestWorkflowEnvironment


    @Test
    fun testWorkflowEnvironmentIsNotNull() {
        assertNotNull(testWorkflowEnvironment, "TestWorkflowEnvironment should not be null")
    }

}
