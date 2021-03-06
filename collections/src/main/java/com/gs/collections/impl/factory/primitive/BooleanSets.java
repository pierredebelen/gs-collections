/*
 * Copyright 2013 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.factory.primitive;

import com.gs.collections.api.factory.set.primitive.ImmutableBooleanSetFactory;
import com.gs.collections.impl.set.immutable.primitive.ImmutableBooleanSetFactoryImpl;

/**
 * BooleanSets is a static utility for creating {@link com.gs.collections.api.factory.set.primitive.ImmutableBooleanSetFactory}.
 *
 * @since 4.0.
 */
@SuppressWarnings("ConstantNamingConvention")
public final class BooleanSets
{
    public static final ImmutableBooleanSetFactory immutable = new ImmutableBooleanSetFactoryImpl();

    private BooleanSets()
    {
        throw new AssertionError("Suppress default constructor for noninstantiability");
    }
}
