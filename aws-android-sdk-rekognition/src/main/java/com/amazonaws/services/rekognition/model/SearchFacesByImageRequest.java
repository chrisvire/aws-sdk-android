/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * For a given input image, first detects the largest face in the image, and
 * then searches the specified collection for matching faces. The operation
 * compares the features of the input face with faces in the specified
 * collection.
 * </p>
 * <note>
 * <p>
 * To search for all faces in an input image, you might first call the API, and
 * then use the face IDs returned in subsequent calls to the API.
 * </p>
 * <p>
 * You can also call the <code>DetectFaces</code> API and use the bounding boxes
 * in the response to make face crops, which then you can pass in to the
 * <code>SearchFacesByImage</code> API.
 * </p>
 * </note>
 * <p>
 * The response returns an array of faces that match, ordered by similarity
 * score with the highest similarity first. More specifically, it is an array of
 * metadata for each face match found. Along with the metadata, the response
 * also includes a <code>similarity</code> indicating how similar the face is to
 * the input face. In the response, the API also returns the bounding box (and a
 * confidence level that the bounding box contains a face) of the face that
 * Rekognition used for the input image.
 * </p>
 * <p>
 * For an example, see <a>example3</a>.
 * </p>
 * <p>
 * This operation requires permissions to perform the
 * <code>rekognition:SearchFacesByImage</code> action.
 * </p>
 */
public class SearchFacesByImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String collectionId;

    /**
     * <p>
     * Provides the source image either as bytes or an S3 object.
     * </p>
     */
    private Image image;

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     */
    private Integer maxFaces;

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return.
     * For example, don't return any matches where confidence in matches is less
     * than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private Float faceMatchThreshold;

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         ID of the collection to search.
     *         </p>
     */
    public String getCollectionId() {
        return collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection to search.
     *            </p>
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * ID of the collection to search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param collectionId <p>
     *            ID of the collection to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageRequest withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * <p>
     * Provides the source image either as bytes or an S3 object.
     * </p>
     *
     * @return <p>
     *         Provides the source image either as bytes or an S3 object.
     *         </p>
     */
    public Image getImage() {
        return image;
    }

    /**
     * <p>
     * Provides the source image either as bytes or an S3 object.
     * </p>
     *
     * @param image <p>
     *            Provides the source image either as bytes or an S3 object.
     *            </p>
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * <p>
     * Provides the source image either as bytes or an S3 object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param image <p>
     *            Provides the source image either as bytes or an S3 object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageRequest withImage(Image image) {
        this.image = image;
        return this;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @return <p>
     *         Maximum number of faces to return. The operation returns the
     *         maximum number of faces with the highest confidence in the match.
     *         </p>
     */
    public Integer getMaxFaces() {
        return maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param maxFaces <p>
     *            Maximum number of faces to return. The operation returns the
     *            maximum number of faces with the highest confidence in the
     *            match.
     *            </p>
     */
    public void setMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
    }

    /**
     * <p>
     * Maximum number of faces to return. The operation returns the maximum
     * number of faces with the highest confidence in the match.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4096<br/>
     *
     * @param maxFaces <p>
     *            Maximum number of faces to return. The operation returns the
     *            maximum number of faces with the highest confidence in the
     *            match.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageRequest withMaxFaces(Integer maxFaces) {
        this.maxFaces = maxFaces;
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return.
     * For example, don't return any matches where confidence in matches is less
     * than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return <p>
     *         (Optional) Specifies the minimum confidence in the face match to
     *         return. For example, don't return any matches where confidence in
     *         matches is less than 70%.
     *         </p>
     */
    public Float getFaceMatchThreshold() {
        return faceMatchThreshold;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return.
     * For example, don't return any matches where confidence in matches is less
     * than 70%.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            (Optional) Specifies the minimum confidence in the face match
     *            to return. For example, don't return any matches where
     *            confidence in matches is less than 70%.
     *            </p>
     */
    public void setFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
    }

    /**
     * <p>
     * (Optional) Specifies the minimum confidence in the face match to return.
     * For example, don't return any matches where confidence in matches is less
     * than 70%.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param faceMatchThreshold <p>
     *            (Optional) Specifies the minimum confidence in the face match
     *            to return. For example, don't return any matches where
     *            confidence in matches is less than 70%.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchFacesByImageRequest withFaceMatchThreshold(Float faceMatchThreshold) {
        this.faceMatchThreshold = faceMatchThreshold;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCollectionId() != null)
            sb.append("CollectionId: " + getCollectionId() + ",");
        if (getImage() != null)
            sb.append("Image: " + getImage() + ",");
        if (getMaxFaces() != null)
            sb.append("MaxFaces: " + getMaxFaces() + ",");
        if (getFaceMatchThreshold() != null)
            sb.append("FaceMatchThreshold: " + getFaceMatchThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getMaxFaces() == null) ? 0 : getMaxFaces().hashCode());
        hashCode = prime * hashCode
                + ((getFaceMatchThreshold() == null) ? 0 : getFaceMatchThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFacesByImageRequest == false)
            return false;
        SearchFacesByImageRequest other = (SearchFacesByImageRequest) obj;

        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null
                && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getMaxFaces() == null ^ this.getMaxFaces() == null)
            return false;
        if (other.getMaxFaces() != null && other.getMaxFaces().equals(this.getMaxFaces()) == false)
            return false;
        if (other.getFaceMatchThreshold() == null ^ this.getFaceMatchThreshold() == null)
            return false;
        if (other.getFaceMatchThreshold() != null
                && other.getFaceMatchThreshold().equals(this.getFaceMatchThreshold()) == false)
            return false;
        return true;
    }
}
