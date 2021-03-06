/*
 * Copyright (C) 2013 Chris Lacy
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.appdotnet4j.model;

public class AdnPaging {
    public int mPage;
    private long mSinceId;
    private Integer mCount;
    private long mMaxId;

    public AdnPaging(int mPage) {
        this.mPage = mPage;
    }

    public long getMaxId() {
        return this.mMaxId;
    }

    public void setMaxId(long mMaxId) {
        this.mMaxId = mMaxId;
    }

    public long getSinceId() {
        return this.mSinceId;
    }

    public void setSinceId(long mSinceId) {
        this.mSinceId = mSinceId;
    }


    public void setCount(Integer mCount) {
        this.mCount = mCount;
    }
}
