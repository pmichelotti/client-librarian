/**
 * Copyright 2014 CITYTECH, Inc.
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
package com.citytechinc.cq.clientlibs.api.services.clientlibs.cache;

import com.citytechinc.cq.clientlibs.api.domain.library.LibraryType;
import com.citytechinc.cq.clientlibs.api.services.clientlibs.exceptions.CachedClientLibraryLookupException;
import com.citytechinc.cq.clientlibs.api.services.clientlibs.exceptions.ClientLibraryCachingException;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;

public interface ClientLibraryCacheManager {

    public String getCachedLibrary(Resource root, LibraryType type) throws CachedClientLibraryLookupException;

    public String getCachedLibrary(Resource root, LibraryType type, String brand) throws CachedClientLibraryLookupException;

    public void cacheLibrary(Resource root, LibraryType type, String libraryContent) throws ClientLibraryCachingException;

    public void cacheLibrary(Resource root, LibraryType type, String brand, String libraryContent) throws ClientLibraryCachingException;

    public void invalidateCache(Resource root, LibraryType type) throws ClientLibraryCachingException;

    public void invalidateCache(Resource root, LibraryType type, String brand) throws ClientLibraryCachingException;

    public void clearCache() throws ClientLibraryCachingException;
}