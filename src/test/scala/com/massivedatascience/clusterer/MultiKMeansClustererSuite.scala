/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This code is a modified version of the original Spark 1.0.2 K-Means implementation.
 */

package com.massivedatascience.clusterer

import org.scalatest._
import funsuite._

import com.holdenkarau.spark.testing.LocalSparkContext

class MultiKMeansClustererSuite extends AnyFunSuite with LocalSparkContext {

  test("apply method") {
    MultiKMeansClusterer(MultiKMeansClusterer.COLUMN_TRACKING)
    MultiKMeansClusterer(MultiKMeansClusterer.MINI_BATCH_10)
    MultiKMeansClusterer(MultiKMeansClusterer.CHANGE_TRACKING)
    MultiKMeansClusterer(MultiKMeansClusterer.RESEED)

  }

}
