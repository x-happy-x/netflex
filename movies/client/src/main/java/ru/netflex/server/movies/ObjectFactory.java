
package ru.netflex.server.movies;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.netflex.server.movies package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _DeleteMovie_QNAME = new QName("http://service.moviesserver.netflex.ru/", "deleteMovie");
    private static final QName _DeleteMovieResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "deleteMovieResponse");
    private static final QName _GetAllMovies_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getAllMovies");
    private static final QName _GetAllMoviesResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getAllMoviesResponse");
    private static final QName _GetMovieById_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getMovieById");
    private static final QName _GetMovieByIdResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getMovieByIdResponse");
    private static final QName _GetMovieByTitle_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getMovieByTitle");
    private static final QName _GetMovieByTitleResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "getMovieByTitleResponse");
    private static final QName _SaveMovie_QNAME = new QName("http://service.moviesserver.netflex.ru/", "saveMovie");
    private static final QName _SaveMovieResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "saveMovieResponse");
    private static final QName _UpdateMovie_QNAME = new QName("http://service.moviesserver.netflex.ru/", "updateMovie");
    private static final QName _UpdateMovieResponse_QNAME = new QName("http://service.moviesserver.netflex.ru/", "updateMovieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.netflex.server.movies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     * @return
     *     the new instance of {@link DeleteMovie }
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     * @return
     *     the new instance of {@link DeleteMovieResponse }
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     * @return
     *     the new instance of {@link GetAllMovies }
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     * @return
     *     the new instance of {@link GetAllMoviesResponse }
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link GetMovieById }
     * 
     * @return
     *     the new instance of {@link GetMovieById }
     */
    public GetMovieById createGetMovieById() {
        return new GetMovieById();
    }

    /**
     * Create an instance of {@link GetMovieByIdResponse }
     * 
     * @return
     *     the new instance of {@link GetMovieByIdResponse }
     */
    public GetMovieByIdResponse createGetMovieByIdResponse() {
        return new GetMovieByIdResponse();
    }

    /**
     * Create an instance of {@link GetMovieByTitle }
     * 
     * @return
     *     the new instance of {@link GetMovieByTitle }
     */
    public GetMovieByTitle createGetMovieByTitle() {
        return new GetMovieByTitle();
    }

    /**
     * Create an instance of {@link GetMovieByTitleResponse }
     * 
     * @return
     *     the new instance of {@link GetMovieByTitleResponse }
     */
    public GetMovieByTitleResponse createGetMovieByTitleResponse() {
        return new GetMovieByTitleResponse();
    }

    /**
     * Create an instance of {@link SaveMovie }
     * 
     * @return
     *     the new instance of {@link SaveMovie }
     */
    public SaveMovie createSaveMovie() {
        return new SaveMovie();
    }

    /**
     * Create an instance of {@link SaveMovieResponse }
     * 
     * @return
     *     the new instance of {@link SaveMovieResponse }
     */
    public SaveMovieResponse createSaveMovieResponse() {
        return new SaveMovieResponse();
    }

    /**
     * Create an instance of {@link UpdateMovie }
     * 
     * @return
     *     the new instance of {@link UpdateMovie }
     */
    public UpdateMovie createUpdateMovie() {
        return new UpdateMovie();
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     * @return
     *     the new instance of {@link UpdateMovieResponse }
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     * @return
     *     the new instance of {@link Movie }
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @return
     *     the new instance of {@link Country }
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     * @return
     *     the new instance of {@link Genre }
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link Title }
     * 
     * @return
     *     the new instance of {@link Title }
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getMovieById")
    public JAXBElement<GetMovieById> createGetMovieById(GetMovieById value) {
        return new JAXBElement<>(_GetMovieById_QNAME, GetMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getMovieByIdResponse")
    public JAXBElement<GetMovieByIdResponse> createGetMovieByIdResponse(GetMovieByIdResponse value) {
        return new JAXBElement<>(_GetMovieByIdResponse_QNAME, GetMovieByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieByTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getMovieByTitle")
    public JAXBElement<GetMovieByTitle> createGetMovieByTitle(GetMovieByTitle value) {
        return new JAXBElement<>(_GetMovieByTitle_QNAME, GetMovieByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByTitleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMovieByTitleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "getMovieByTitleResponse")
    public JAXBElement<GetMovieByTitleResponse> createGetMovieByTitleResponse(GetMovieByTitleResponse value) {
        return new JAXBElement<>(_GetMovieByTitleResponse_QNAME, GetMovieByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "saveMovie")
    public JAXBElement<SaveMovie> createSaveMovie(SaveMovie value) {
        return new JAXBElement<>(_SaveMovie_QNAME, SaveMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaveMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "saveMovieResponse")
    public JAXBElement<SaveMovieResponse> createSaveMovieResponse(SaveMovieResponse value) {
        return new JAXBElement<>(_SaveMovieResponse_QNAME, SaveMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "updateMovie")
    public JAXBElement<UpdateMovie> createUpdateMovie(UpdateMovie value) {
        return new JAXBElement<>(_UpdateMovie_QNAME, UpdateMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.moviesserver.netflex.ru/", name = "updateMovieResponse")
    public JAXBElement<UpdateMovieResponse> createUpdateMovieResponse(UpdateMovieResponse value) {
        return new JAXBElement<>(_UpdateMovieResponse_QNAME, UpdateMovieResponse.class, null, value);
    }

}
