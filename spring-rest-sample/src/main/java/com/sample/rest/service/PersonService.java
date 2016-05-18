/**
 * Copyright (c) 2011-2016. Cargo Móvil S.A.P.I.
 *
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Cargo Móvil S.A.P.I. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Cargo Móvil S.A.P.I.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.sample.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sample.rest.model.Person;

/**
 * @author agomez
 *
 */
@Service
public interface PersonService {
	List<Person> findAllByFirstName(String firstName);
	Person save(Person person);
	/**
	 * @param id
	 * @return
	 */
	Person findOne(Long id);
	/**
	 * @return
	 */
	Iterable<Person> findAll();
	/**
	 * 
	 */
	void delete(Long id);
}
