package com.example.campusguide

import com.example.campusguide.directions.DirectionsTest
import com.example.campusguide.directions.EmptyDirectionsGuardTest
import com.example.campusguide.utils.DatabaseTest
import com.example.campusguide.utils.request.ApiKeyRequestDecoratorTest
import com.example.campusguide.utils.request.RequestQueueTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    EmptyDirectionsGuardTest::class,
    DatabaseTest::class,
    RequestQueueTest::class,
    DirectionsTest::class,
    ApiKeyRequestDecoratorTest::class
)

class RunAllTestSuite